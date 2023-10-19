package com.test.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CruzeiroMatches implements Matches{
    @Override
    public String matchesBrasileirao() {
        return "FLUxSAN, CAPxCRU, INTxCU, CORxVAS, FORxRBB, CAMxFLA, SAO,BAH, AMExPAL, BOTxCOR, GOIxGRE";
    }
}
