package com.budget.sbhacks;

import java.util.HashMap;

/**
 * Created by Shreyas Niradi on 1/20/2017.
 */

public class Account {
    private String username;
    private String publicToken;
    private String accountID;
    private String accountName;
    private String  insitutionType;
    private String insitutionName;

    public Account(HashMap<String,String> linkData){
        linkData.get("public_token");
        linkData.get("account_id");
    }

}
