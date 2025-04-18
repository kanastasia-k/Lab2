/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

/**
 *
 * @author kozhe
 */
public class DolGuldurOrkBuilderFactory implements OrkBuilderFactory {
    @Override
    public OrkBuilder createOrkBuilder() {
        DolGuldurOrkBuilder builder = new DolGuldurOrkBuilder();
        builder.setGearFactory(new DolGuldurGearFactory());
        return builder;
    }
}
