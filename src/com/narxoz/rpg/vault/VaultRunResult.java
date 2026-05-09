package com.narxoz.rpg.vault;

public class VaultRunResult {
    private boolean trap;
    private int price;
    private String report;
    private String before;
    private String after;

    public VaultRunResult(boolean trap, int price, String report, String before, String after) {
        this.trap = trap;
        this.price = price;
        this.report = report;
        this.before = before;
        this.after = after;
    }

    public boolean isTrap() {
        return trap;
    }

    public int getPrice() {
        return price;
    }

    public String getReport() {
        return report;
    }

    public String getBefore() {
        return before;
    }

    public String getAfter() {
        return after;
    }
}
