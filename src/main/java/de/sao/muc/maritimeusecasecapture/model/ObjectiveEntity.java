package de.sao.muc.maritimeusecasecapture.model;

import javax.persistence.*;

@Entity
@Table(name = "objective", schema = "use_case_db", catalog = "")
public class ObjectiveEntity {
    private int id;
    private String name;
    private String description;
    private int useCaseId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "use_case_id")
    public int getUseCaseId() {
        return useCaseId;
    }

    public void setUseCaseId(int useCaseId) {
        this.useCaseId = useCaseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ObjectiveEntity that = (ObjectiveEntity) o;

        if (id != that.id) return false;
        if (useCaseId != that.useCaseId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + useCaseId;
        return result;
    }
}
