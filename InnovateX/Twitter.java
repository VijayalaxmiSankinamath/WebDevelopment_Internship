class Twitter {

    void tweet(String text) {
        System.out.println("Tweet posted: " + text);
    }

    void tweet(String text, String image) {
        System.out.println("Tweet posted: " + text);
        System.out.println("Image attached: " + image);
    }

    void tweet(String text, String image, String hashtag) {
        System.out.println("Tweet posted: " + text);
        System.out.println("Image: " + image);
        System.out.println("Hashtag: " + hashtag);
    }

    public static void main(String[] args) {
        Twitter app = new Twitter();

        app.tweet("Hello Twitter!");
        app.tweet("Good morning!", "sunrise.jpg");
        app.tweet("Learning Java", "code.png", "#MethodOverloading");

   
    }
}