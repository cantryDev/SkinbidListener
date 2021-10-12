package de.cantry.skinbidlistener;

import com.google.gson.Gson;
import de.cantry.skinbidlistener.response.FullAuction;
import de.cantry.skinbidlistener.response.SkinBidAuctionsResponse;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class SkinBidClient {

    private HttpClient client = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_1_1)
            .followRedirects(HttpClient.Redirect.NORMAL)
            .connectTimeout(Duration.ofSeconds(20))
            .build();

    private String baseUrl = "https://api.skinbid.com/api/";

    List<FullAuction> getAllRunningAuctions(){
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(baseUrl +"search/auctions?take=10000&skip=0&sort=time-left%23asc&currency=EUR"))
                .timeout(Duration.ofMinutes(2))
                .header("Content-Type", "application/json")
                .GET()
                .build();
        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            SkinBidAuctionsResponse skinBidAuctionsResponse = new Gson().fromJson(response.body(),SkinBidAuctionsResponse.class);
            return skinBidAuctionsResponse.getFullAuctions();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

}
