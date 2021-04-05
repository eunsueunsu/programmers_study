package com.company.proLevel1;

import java.util.Arrays;
import java.util.List;

public class Solution {

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        int index=0;
        List<String> participantList = Arrays.asList(participant);
        for ( String p : participantList){
            index++;
            if(Arrays.asList(completion).contains(p)){
                        participantList.remove(p);
            }
        }
        answer=participantList.get(0);
        return answer;
    }
}
