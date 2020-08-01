package me.perfectpixel.fullpvp.message.menu;

import me.perfectpixel.fullpvp.files.FileCreator;

import me.yushust.inject.Inject;
import me.yushust.inject.name.Named;

import java.util.List;

public class SimpleMessageMenu implements MessageMenu {

    @Inject
    @Named("menu")
    private FileCreator menu;

    @Override
    public String getString(String key) {
        return menu.getString(key, key);
    }

    @Override
    public String getTitle(String keyMenu) {
        return menu.getString(keyMenu + ".title");
    }

    @Override
    public String getItemName(String keyMenu, String keyItem) {
        return menu.getString(keyMenu + ".items." + keyItem + ".name");
    }

    @Override
    public List<String> getItemLore(String keyMenu, String keyItem) {
        return menu.getStringList(keyMenu + ".items." + keyItem + ".lore");
    }

}