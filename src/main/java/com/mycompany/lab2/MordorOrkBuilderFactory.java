/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

/**
 *
 * @author kozhe
 */
public class MordorOrkBuilderFactory implements OrkBuilderFactory {
    @Override
    public OrkBuilder createOrkBuilder() {
        MordorOrkBuilder builder = new MordorOrkBuilder();
        builder.setGearFactory(new MordorGearFactory()); 
        return builder;
    }
}
