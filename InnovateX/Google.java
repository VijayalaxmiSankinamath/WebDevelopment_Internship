class Google {

 
    void search(String keyword) {
        System.out.println("Searching for: " + keyword);
    }


    void search(String keyword, String location) {
        System.out.println("Searching for: " + keyword);
        System.out.println("Location: " + location);
    }

    void search(String keyword, String location, String language) {
        System.out.println("Searching for: " + keyword);
        System.out.println("Location: " + location);
        System.out.println("Language: " + language);
    }


    public static void main(String[] args) {
        Google g = new Google();

        g.search("Java method overloading");
        g.search("Best colleges", "India");
        g.search("Weather", "Bangalore", "English");

    }
}