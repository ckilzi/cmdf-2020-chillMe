package com.example.chillme.model;

public class Joke {
    private String setup;
    private String punchline;
    private static int id;
    private String category;

    public Joke() {
        this.id=id++;
    }

    public Joke(String setup, String punchline, String category) {
        this.setup = setup;
        this.punchline = punchline;
        this.category = category;
        this.id=id++;
    }

    @Override
    public String toString() {
        return "Joke{" +
                "setup='" + setup + '\'' +
                ", punchline='" + punchline + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    public static int getId() {
        return id;
    }

    public String getSetup() {
        return setup;
    }

    public void setSetup(String setup) {
        this.setup = setup;
    }

    public String getPunchline() {
        return punchline;
    }

    public void setPunchline(String punchline) {
        this.punchline = punchline;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
