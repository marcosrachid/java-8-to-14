package com.template.java_11.http_client;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class Main {

  private static final HttpClient client = HttpClient.newBuilder()
      .version(Version.HTTP_1_1)
      .connectTimeout(Duration.ofMinutes(2))
      .build();

  public static void main(String[] args) throws IOException, InterruptedException {
    HttpRequest request = HttpRequest.newBuilder()
        .GET()
        .uri(URI.create("https://www.google.com/"))
        .setHeader("User-Agent", "Java 11 HttpClient")
        .build();

    HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());

    // print response headers
    HttpHeaders headers = response.headers();
    headers.map().forEach((k, v) -> System.out.println(k + ":" + v));

    // print status code
    System.out.println(response.statusCode());

    // print response body
    System.out.println(response.body());
  }

}
