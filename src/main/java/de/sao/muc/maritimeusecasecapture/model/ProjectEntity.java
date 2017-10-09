package de.sao.muc.maritimeusecasecapture.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "project", schema = "use_case_db", catalog = "")
public class ProjectEntity {
    private int id;
    private String title;
    private String shortDescription;
    private int version;
    private Timestamp latestUpdate;
    private Collection<UserEntity> users;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "short_description")
    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    @Basic
    @Column(name = "version")
    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Basic
    @Column(name = "latest_update")
    public Timestamp getLatestUpdate() {
        return latestUpdate;
    }

    public void setLatestUpdate(Timestamp latestUpdate) {
        this.latestUpdate = latestUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjectEntity that = (ProjectEntity) o;

        if (id != that.id) return false;
        if (version != that.version) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (shortDescription != null ? !shortDescription.equals(that.shortDescription) : that.shortDescription != null)
            return false;
        if (latestUpdate != null ? !latestUpdate.equals(that.latestUpdate) : that.latestUpdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (shortDescription != null ? shortDescription.hashCode() : 0);
        result = 31 * result + version;
        result = 31 * result + (latestUpdate != null ? latestUpdate.hashCode() : 0);
        return result;
    }

    @ManyToMany(mappedBy = "projects")
    public Collection<UserEntity> getUsers() {
        return users;
    }

    public void setUsers(Collection<UserEntity> users) {
        this.users = users;
    }
}
