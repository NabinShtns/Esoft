package com.nabin.esoft.controller;

import com.nabin.esoft.model.UserData;

public class ControllerClass {
    public boolean CheckUser(UserData sd) {
        if ((sd.getName().equals("nabin")) && (sd.getPassword().equals("nabin"))) {
            return true;

        } else {
            return false;
        }
    }

}
