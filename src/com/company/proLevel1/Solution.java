package com.company.proLevel1;

import sun.awt.image.ImageWatched;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    //    ["mislav", "stanko", "mislav", "ana"]	["stanko", "ana", "mislav"]
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }
        for (String key : map.keySet()) {
            if (map.get(key) > 0) answer = key;
        }
        return answer;
    }
}
