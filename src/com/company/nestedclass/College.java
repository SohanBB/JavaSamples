package com.company.nestedclass;

class College extends Trust{
    static class Student {
        String name= "John";
        String sirname = "Carter";
        String getFullName (){
            return name +" "+ sirname;
        }
    }
}
