/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mineSQL.ormlite.model;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 *
 * @author alessio.finamore
 */
@DatabaseTable(tableName = "POST")
public class Post {

	@DatabaseField(generatedId = true)
    private int id;

	@DatabaseField(columnName = "TITLE")
	private String title;
	@DatabaseField(columnName = "LINK")
	private String link;
	@DatabaseField(columnName = "DESCRIPTION")
	private String description;
	@DatabaseField(columnName = "TEXT", dataType = DataType.STRING_BYTES)
	private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    public Post() {
    }

    public Post(String title, String link, String description, String text) {
        this.title = title;
        this.link = link;
        this.description = description;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Post{" + "id=" + id + ", title=" + title + ", link=" + link + ", description=" + description + '}';
    }

}