package com.example.restaurantcapitolserver.Common;

import com.example.restaurantcapitolserver.Model.User;

public class Common {
    public static User currentUser;

    public static final String UPDATE = "Update";
    public static final String DELETE = "Delete";

    public static final int PICK_IMAGE_REQUEST = 71;

    public static String convertCodeToStatus(String code)
    {
        if (code.equals("0"))
            return "Comanda plasata";
        else if (code.equals("1"))
            return "Comanda este in drum spre tine";      // atributele acestea le gasim in OrderStatus in metoda loadOrders !
        else
            return "Comanda livrata";
    }
}
