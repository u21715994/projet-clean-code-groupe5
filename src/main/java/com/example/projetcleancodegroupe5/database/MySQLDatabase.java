package com.example.projetcleancodegroupe5.database;

import com.example.projetcleancodegroupe5.functional.model.Hero;
import com.example.projetcleancodegroupe5.functional.model.Player;

import java.sql.*;

public class MySQLDatabase implements Database{
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://91.121.230.45:3306/cleancode";
    private static final String USER = "cleancode";
    private static final String PASS = "OX0nQ7%4*!5cjm_A";

    private Connection conn;

    public MySQLDatabase() {
        connection();
    }

    @Override
    public void connection(){
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connexion à la base de données réussie !");
        } catch (SQLException e) {
            System.err.println("Erreur lors de la connexion à la base de données : " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Erreur lors du chargement du driver JDBC : " + e.getMessage());
        }
    }

    @Override
    public void close() {
        try {
            conn.close();
        } catch (SQLException e) {
            System.err.println("Erreur lors de la fermeture de la connexion : " + e.getMessage());
        }
    }

    @Override
    public void addHero(Hero hero) {
        String sql = "INSERT INTO hero (name, life_point, speciality, experience_point, power, armor, rarity, level) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement statement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, hero.getName());
            statement.setFloat(2, hero.getLifePoint());
            statement.setString(3, hero.getSpeciality());
            statement.setFloat(4, hero.getExperiencePoint());
            statement.setFloat(5, hero.getPower());
            statement.setFloat(6, hero.getArmor());
            statement.setString(7, hero.getRarity());
            statement.setFloat(8, hero.getLevel());
            int rowsInserted = statement.executeUpdate();

            if (rowsInserted > 0) {
                ResultSet rs = statement.getGeneratedKeys();
                if (rs.next()) {
                    hero.setId(rs.getString(1));
                }
            }
        } catch (SQLException e) {
            System.err.println("Erreur lors de l'ajout du hero à la base de données : " + e.getMessage());
        }
    }

    @Override
    public void updateHero(String id, Hero hero) {
        String sql = "UPDATE hero SET name = ?, life_point = ?, speciality = ?, experience_point = ?, power = ?, armor = ?, rarity = ?, level = ? WHERE id = ?";
        try {
            PreparedStatement statement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, hero.getName());
            statement.setFloat(2, hero.getLifePoint());
            statement.setString(3, hero.getSpeciality());
            statement.setFloat(4, hero.getExperiencePoint());
            statement.setFloat(5, hero.getPower());
            statement.setFloat(6, hero.getArmor());
            statement.setString(7, hero.getRarity());
            statement.setFloat(8, hero.getLevel());
            statement.setString(9, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erreur lors de la mise à jour du hero dans la base de données : " + e.getMessage());
        }
    }

    @Override
    public void addPlayer(Player player) {
        String sql = "INSERT INTO player (name, token, numberBattleWin) VALUES (?, ?, ?)";
        try {
            PreparedStatement statement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, player.getName());
            statement.setFloat(2, player.getToken());
            statement.setFloat(3, player.getNumberBattleWin());
            int rowsInserted = statement.executeUpdate();

            if (rowsInserted > 0) {
                ResultSet rs = statement.getGeneratedKeys();
                if (rs.next()) {
                    player.setId(rs.getString(1));
                }
            }
        } catch (SQLException e) {
            System.err.println("Erreur lors de l'ajout du joueur à la base de données : " + e.getMessage());
        }
    }

    @Override
    public void updatePlayer(String id, Player player) {
        String sql = "UPDATE player SET name = ?, token = ?, numberBattleWin = ? WHERE id = ?";
        try {
            PreparedStatement statement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, player.getName());
            statement.setFloat(2, player.getToken());
            statement.setFloat(3, player.getNumberBattleWin());
            statement.setString(4, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erreur lors de la mise à jour du joueur dans la base de données : " + e.getMessage());
        }
    }

}
