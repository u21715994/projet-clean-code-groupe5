package com.example.projetcleancodegroupe5.functional.service;

import com.example.projetcleancodegroupe5.functional.model.*;

public class PlayerOpenPackService {
    public static Player openPack(Player player, int tokenRequired){
        if(player.getToken() <= 0)
            throw new IllegalArgumentException("Vous ne pouvez plus ouvrir de pack car vous avez 0 jeton");
        if(player.getToken() - tokenRequired <= 0)
            throw new IllegalArgumentException("Vous ne pouvez pas ouvrir ce pack, vous n'avez pas le nombre de jeton requis");
        if(tokenRequired == 1) {
            player = new AddHeroPackSilver(new PackSilver()).addHeroesToDeck(player, tokenRequired);
            UpdatePlayerInDatabaseService.updatePlayer(player.getID(), player);
            return player;
        }else if(tokenRequired == 2) {
            player = new AddHeroPackDiamond(new PackDiamond()).addHeroesToDeck(player, tokenRequired);
            UpdatePlayerInDatabaseService.updatePlayer(player.getID(), player);
            return player;
        }else if(tokenRequired != 1 && tokenRequired != 2)
            throw new IllegalArgumentException("Vous ne pouvez utiliser que un ou 2 jetons");
        return null;
    }
}
