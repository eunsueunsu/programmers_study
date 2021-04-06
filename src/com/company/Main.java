package com.company;

import com.company.proLevel1.Solution;

public class Main {

    public static void main(String[] args) {
	// write your code here


        // 1번
        String[] participant ={"mislav", "stanko", "mislav", "ana"};
        String[] completion ={"stanko", "ana", "mislav"};
        Solution solution= new Solution();
        System.out.println( solution.solution(participant,completion));
    }
}
