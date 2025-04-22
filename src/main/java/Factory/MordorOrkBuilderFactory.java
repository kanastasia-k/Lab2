/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;

import AbstractFactory.MordorGearFactory;
import Builder.OrkBuilder;
import Builder.MordorOrkBuilder;

/**
 *
 * @author kozhe
 */
public class MordorOrkBuilderFactory extends OrkBuilderFactory {
    @Override
    public OrkBuilder createOrkBuilder() {
        return new MordorOrkBuilder();
    }
}
//    public OrkBuilder createOrkBuilder() {
//        MordorOrkBuilder builder = new MordorOrkBuilder();
//        builder.setGearFactory(new MordorGearFactory()); 
//        return builder;
//    }