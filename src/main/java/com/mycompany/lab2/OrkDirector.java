/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2;

/**
 *
 * @author kozhe
 */

public class OrkDirector {
    private OrkBuilder orkBuilder;
    
    public void setOrkBuilder(OrkBuilder builder) {
        this.orkBuilder = builder;
    }
    
    public Ork getOrk() {
        return orkBuilder.getOrk();
    }
    
    public Ork createBasicOrk() {
        orkBuilder.createNewOrk();
        orkBuilder.buildName();
        orkBuilder.buildTribe();
        orkBuilder.buildWeapon();
        orkBuilder.buildArmor();
        orkBuilder.buildBanner();
        orkBuilder.buildStrenth();
        orkBuilder.buildAgility();
        orkBuilder.buildIntelligence();
        orkBuilder.buildHealth();
        return getOrk();
    }
    
    public Ork createLeaderOrk() {
        Ork ork = createBasicOrk();
        ork.setStrength(ork.getStrength() + 20);
        ork.setHealth(ork.getHealth() + 50);
        ork.setBanner(ork.getBanner() + " и горн");
        return ork;
    }
    
    // Орк-разведчик (высокая ловкость, лук вместо меча)
    public Ork createScoutOrk() {
        Ork ork = createBasicOrk();
        ork.setWeapon("лук");
        ork.setAgility(ork.getAgility() + 30);
        ork.setHealth(ork.getHealth() - 20); // Меньше здоровья за мобильность
        return ork;
    }
    
    // Дополнительный метод для кастомной сборки
    public void constructCustomOrk(boolean withBanner, boolean isRanged) {
        orkBuilder.createNewOrk();
        orkBuilder.buildName();
        orkBuilder.buildTribe();
        orkBuilder.buildStrenth();
        orkBuilder.buildAgility();
        orkBuilder.buildIntelligence();
        orkBuilder.buildHealth();
        
        if (isRanged) {
            orkBuilder.buildWeapon("Лук"); // Предполагаем перегруженный метод
        } else {
            orkBuilder.buildWeapon();
        }
        
        if (withBanner) {
            orkBuilder.buildBanner();
        }
    }
}
