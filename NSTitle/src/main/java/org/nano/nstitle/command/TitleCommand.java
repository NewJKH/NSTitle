package org.nano.nstitle.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class TitleCommand implements CommandExecutor {
    /**
    * @description title
     * </tt create <unique>
     * </tt set name <unique>

     * </tt set lore add <unique>
     * </tt set lore remove <line> <unique>
     * </tt set lore init <unique>

     * </tt give <playername> <unique>
     * </tt take <playername> <unique>
     * </tt list
     * </tt list <playername>
     *
     * </tt list
     *
     *
     */
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        return false;
    }
}
