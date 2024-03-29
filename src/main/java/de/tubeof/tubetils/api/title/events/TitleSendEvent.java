package de.tubeof.tubetils.api.title.events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class TitleSendEvent extends Event {

    private static final HandlerList handlers = new HandlerList();
    private final Player player;
    private String title;
    private String subtitle;
    private Boolean cancelled;

    public TitleSendEvent(Player player, String title, String subtitle) {
        this.player = player;
        this.title = title;
        this.subtitle = subtitle;
        this.cancelled = false;
    }

    @Override
    public HandlerList getHandlers() {
        return this.handlers;
    }

    public Player getPlayer() {
        return this.player;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public boolean isCancelled() {
        return this.cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}