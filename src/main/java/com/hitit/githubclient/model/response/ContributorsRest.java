package com.hitit.githubclient.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ContributorsRest {

    private String login;
    private int id;
    @JsonProperty("node_id")
    private int nodeID;
    @JsonProperty("avatar_url")
    private String avatarURL;
    private String URL;
    @JsonProperty(value = "html_url")
    private String htmlURL;
    @JsonProperty(value = "followers_url")
    private String followersURL;
    @JsonProperty(value = "following_url")
    private String followingURL;
    @JsonProperty(value = "gists_url")
    private String gistsURL;
    @JsonProperty(value = "starred_url")
    private String starredUrl;
    @JsonProperty(value = "subscriptions_url")
    private String subscriptionsURL;
    @JsonProperty(value = "organizations_url")
    private String organizationsURL;
    @JsonProperty(value = "repos_url")
    private String reposURL;
    @JsonProperty(value = "events_url")
    private String eventsURL;
    @JsonProperty(value = "received_events_url")
    private String receivedEventsURL;
    private String type;
    @JsonProperty(value = "site_admin")
    private String siteAdmin;
    private int contributions;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNodeID() {
        return nodeID;
    }

    public void setNodeID(int nodeID) {
        this.nodeID = nodeID;
    }

    public String getAvatarURL() {
        return avatarURL;
    }

    public void setAvatarURL(String avatarURL) {
        this.avatarURL = avatarURL;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getHtmlURL() {
        return htmlURL;
    }

    public void setHtmlURL(String htmlURL) {
        this.htmlURL = htmlURL;
    }

    public String getFollowersURL() {
        return followersURL;
    }

    public void setFollowersURL(String followersURL) {
        this.followersURL = followersURL;
    }

    public String getFollowingURL() {
        return followingURL;
    }

    public void setFollowingURL(String followingURL) {
        this.followingURL = followingURL;
    }

    public String getGistsURL() {
        return gistsURL;
    }

    public void setGistsURL(String gistsURL) {
        this.gistsURL = gistsURL;
    }

    public String getStarredUrl() {
        return starredUrl;
    }

    public void setStarredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
    }

    public String getSubscriptionsURL() {
        return subscriptionsURL;
    }

    public void setSubscriptionsURL(String subscriptionsURL) {
        this.subscriptionsURL = subscriptionsURL;
    }

    public String getOrganizationsURL() {
        return organizationsURL;
    }

    public void setOrganizationsURL(String organizationsURL) {
        this.organizationsURL = organizationsURL;
    }

    public String getReposURL() {
        return reposURL;
    }

    public void setReposURL(String reposURL) {
        this.reposURL = reposURL;
    }

    public String getEventsURL() {
        return eventsURL;
    }

    public void setEventsURL(String eventsURL) {
        this.eventsURL = eventsURL;
    }

    public String getReceivedEventsURL() {
        return receivedEventsURL;
    }

    public void setReceivedEventsURL(String receivedEventsURL) {
        this.receivedEventsURL = receivedEventsURL;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSiteAdmin() {
        return siteAdmin;
    }

    public void setSiteAdmin(String siteAdmin) {
        this.siteAdmin = siteAdmin;
    }

    public int getContributions() {
        return contributions;
    }

    public void setContributions(int contributions) {
        this.contributions = contributions;
    }
}
