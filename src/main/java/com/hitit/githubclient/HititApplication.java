package com.hitit.githubclient;

import com.hitit.githubclient.api.RetroGithubAPI;
import com.hitit.githubclient.service.ServiceConstants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


@SpringBootApplication
public class HititApplication {

    public static void main(String[] args) {
        SpringApplication.run(HititApplication.class, args);
        browse("http://localhost:8080/");
    }

    /* Auto Start localhost*/
    public static void browse(String url) {
        if(Desktop.isDesktopSupported()){
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.browse(new URI(url));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        }else{
            Runtime runtime = Runtime.getRuntime();
            try {
                runtime.exec("rundll32 url.dll,FileProtocolHandler " + url);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    @Bean
    public RetroGithubAPI buildRetrofit() {
        final Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ServiceConstants.API_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(RetroGithubAPI.class);
    }
}
