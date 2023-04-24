import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    String concatStr = "";

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return """
                Type \"/add-message?s=<string>\" to add messages
                """;
        } else if (url.getPath().contains("/add-message")) {
            String[] parameters = url.getQuery().split("=");
            if (parameters[0].equals("s")) {
                concatStr = concatStr + parameters[1] + "\n";
                return concatStr;
            } else {
                return "Invalid query!";
            }
        } 
        return "404 Not Found!";
    }
}

class StringSearch {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}