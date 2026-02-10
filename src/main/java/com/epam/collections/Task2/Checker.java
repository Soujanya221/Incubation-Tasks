package com.epam.collections.Task2;

import java.util.*;

class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a, Player b) {
        // First, compare by score (descending)
        if (a.score != b.score) {
            return b.score - a.score; // higher score comes first
        } else {
            // If scores are equal, compare by name (ascending)
            return a.name.compareTo(b.name);
        }
    }
}
