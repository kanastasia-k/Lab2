/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

/**
 *
 * @author kozhe
 */
public class MistyMountainsOrkBuilderFactory implements OrkBuilderFactory {
    @Override
    public OrkBuilder createOrkBuilder() {
        MistyMountainsOrkBuilder builder = new MistyMountainsOrkBuilder();
        builder.setGearFactory(new MistyMountainsGearFactory());
        return builder;
    }
}
