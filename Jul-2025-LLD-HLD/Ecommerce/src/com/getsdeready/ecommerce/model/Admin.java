package com.getsdeready.ecommerce.model;

import java.util.List;

/**
 * Only use separate classes when you have to add
 * extra members or behavior to the child classes
 */
public class Admin extends User {

    private List<String> accesses;
}
