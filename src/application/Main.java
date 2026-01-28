package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Comment;
import entities.Post;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        List<Post> allPosts = new ArrayList<>();

        System.out.print("how many posts: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<n; i++) {
            System.out.println("\nenter data #" + (i+1) + " post: ");
            System.out.print("title: ");
            String title = sc.nextLine();

            System.out.print("content: ");
            String content = sc.nextLine();

            System.out.print("likes: ");
            Integer likes = sc.nextInt();
            sc.nextLine();

            System.out.print("date (dd/MM/yy HH:mm): ");
            String dateInput = sc.nextLine();
            LocalDateTime moment = LocalDateTime.parse(dateInput, fmt);

            Post post = new Post(moment, title, content, likes);

            allPosts.add(post);

            System.out.print("\nhow many comments for this post: ");
            int m = sc.nextInt();
            sc.nextLine();

            for (int j=0; j<m; j++) {
                System.out.println("comment #" + (j+1) + ": ");
                String text = sc.nextLine();
                Comment comment = new Comment(text);
                post.addComments(comment);
            }
        }

        System.out.println("\n-------------------------------\n");
        for(Post p : allPosts) {
            System.out.println(p);
        }

        sc.close();
    }
}