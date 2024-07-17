package com.pingwit.part_22.homework.task_1;

 class ShopsList {
     private String name;
     private String id;

     public ShopsList(String name, String id) {
         this.name = name;
         this.id = id;
     }

     public String getName() {

         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getId() {
         return id;
     }

     public void setId(String id) {
         this.id = id;
     }

     @Override
     public String toString() {
         return "ShopsList{" +
                 "name='" + name + '\'' +
                 ", id='" + id + '\'' +
                 '}';
     }
 }
