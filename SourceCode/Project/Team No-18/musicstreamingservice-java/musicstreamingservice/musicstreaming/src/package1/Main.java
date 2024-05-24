package package1;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        
        Subscription basicSubscription = new Subscription(1, "Basic", 9.99);
        Subscription premiumSubscription = new Subscription(2, "Premium", 19.99);

        User user1 = new User(1, "user1@example.com", "user1", "password1", basicSubscription.getSubscriptionId());
        User user2 = new User(2, "user2@example.com", "user2", "password2", premiumSubscription.getSubscriptionId());

        Artist artist1 = new Artist(1, "Artist One");
        Artist artist2 = new Artist(2, "Artist Two");

        artist1.addGenreId(1);
        artist2.addGenreId(2);

        Genre genre1 = new Genre(1, "Rock");
        Genre genre2 = new Genre(2, "Pop");

    
        Album album1 = new Album(1, artist1.getArtistId(), "Album One", genre1.getGenreId(), new Date());
        Album album2 = new Album(2, artist2.getArtistId(), "Album Two", genre2.getGenreId(), new Date());

        Song song1 = new Song(1, "Song One", artist1.getArtistId(), album1.getAlbumId(), 240, new Date());
        song1.addGenreId(genre1.getGenreId());
        Song song2 = new Song(2, "Song Two", artist2.getArtistId(), album2.getAlbumId(), 180, new Date());
        song2.addGenreId(genre2.getGenreId());

        Playlist playlist1 = new Playlist(1, user1.getUserId(), "Playlist One");
        playlist1.addSongId(song1.getSongId());
        playlist1.addSongId(song2.getSongId());

        History history1 = new History(1, user1.getUserId(), song1.getSongId(), new Date());
        user1.addHistory(history1);
        History history2 = new History(2, user2.getUserId(), song2.getSongId(), new Date());
        user2.addHistory(history2);

        Recommendation rec1 = new Recommendation(1, 1, "Recommended Song One");
        user1.addRecommendation(rec1);
        Recommendation rec2 = new Recommendation(2, 2, "Recommended Song Two");
        user2.addRecommendation(rec2);

        Payment payment1 = new Payment(1, 9.99, new Date(), user1.getUserId());
        user1.addPayment(payment1);
        Payment payment2 = new Payment(2, 19.99, new Date(), user2.getUserId());
        user2.addPayment(payment2);

        System.out.println("User 1 Subscription: " + basicSubscription.getName());
        System.out.println("User 1 Recommendations: " + user1.getRecommendations().size());
        System.out.println("User 1 History: " + user1.getHistory().size());
        System.out.println("User 1 Payments: " + user1.getPayments().size());

        System.out.println("Artist 1 Name: " + artist1.getName());
        System.out.println("Artist 1 Genres: " + artist1.getGenreIds().size());

        System.out.println("Playlist 1 Songs: " + playlist1.getSongIds().size());

        System.out.println("Song 1 Title: " + song1.getTitle());
        System.out.println("Song 1 Genres: " + song1.getGenreIds().size());
    }
}