package edu.unl.raikes.git;
public class gitLab {
    public static void main(String[] args) {
        GitLabHelper helper = new GitLabHelper(new String[] {"Max",
                "Arjun"});
        helper.PrintWelcomeMessage();
    }
}