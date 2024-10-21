package com.github.affandes.kuliah.pm;

import java.util.LinkedList;

public class BrowserHistory {
    private LinkedList<String> history;

    public BrowserHistory() {
        history = new LinkedList<>();
    }

    public void view() {
        if (history.isEmpty()) {
            System.out.println("History browser kosong.");
            return;
        }
        System.out.println("History Browser (dari yang terbaru):");
        for (int i = history.size() - 1; i >= 0; i--) {
            System.out.println(history.get(i));
        }
    }

    public void browse(String website) {
        history.add(website);
        System.out.println("Mengunjungi: " + website);
    }

    public void back() {
        if (history.isEmpty()) {
            System.out.println("Tidak ada history untuk kembali.");
            return;
        }
        String lastVisited = history.removeLast();
        System.out.println("Kembali dari: " + lastVisited);
    }

    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();

        browserHistory.browse("www.youtube.com");
        browserHistory.browse("www.canva.com");
        browserHistory.browse("www.yahoo.com");

        browserHistory.view();

        browserHistory.back();
        browserHistory.view();

        browserHistory.back();
        browserHistory.view();

        browserHistory.back();
        browserHistory.view();

        browserHistory.back();
    }
}
