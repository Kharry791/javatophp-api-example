/**
 * Created by Harry Kurniawan (harry@harrykrn.com | k.harry791@gmail.com)
 * on 04/01/17.
 */

package test;

import com.google.gson.Gson;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test {

    public static String postEndChat(long lChatId) throws Exception {
        String       postUrl = ""; // your API url
        String       line    = "";
        StringBuffer result  = new StringBuffer();
        StringEntity postingString;

        ChatModel      chat = new ChatModel();
        Gson           gson = new Gson();
        HttpPost       post = new HttpPost(postUrl);
        BufferedReader rd;

        HttpClient   httpClient = HttpClientBuilder.create().build();
        HttpResponse response   = null;

        chat.setChatId(lChatId);
        chat.setChatMsg("Apa kabar?");
        chat.setChatUser("Ahay");

        postingString = new StringEntity(gson.toJson(chat));
        post.setEntity(postingString);
        post.setHeader("Content-Type", "application/json");
        response = httpClient.execute(post);

        rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));

        while ((line = rd.readLine()) != null) {
            result.append(line);
        }

        return result.toString();
    }

    public static void main(String[] arg) {
        try {
            System.out.println(postEndChat(1000));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

