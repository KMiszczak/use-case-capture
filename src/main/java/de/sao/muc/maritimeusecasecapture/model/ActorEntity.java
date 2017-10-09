package de.sao.muc.maritimeusecasecapture.model;

import javax.persistence.*;

@Entity
@Table(name = "actor", schema = "use_case_db", catalog = "")
public class ActorEntity {
    private int id;
    private String actor;
    private String actorType;
    private String topologicalAllocation;
    private String aim;
    private String furtherInformation;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "actor")
    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    @Basic
    @Column(name = "actor_type")
    public String getActorType() {
        return actorType;
    }

    public void setActorType(String actorType) {
        this.actorType = actorType;
    }

    @Basic
    @Column(name = "topological_allocation")
    public String getTopologicalAllocation() {
        return topologicalAllocation;
    }

    public void setTopologicalAllocation(String topologicalAllocation) {
        this.topologicalAllocation = topologicalAllocation;
    }

    @Basic
    @Column(name = "aim")
    public String getAim() {
        return aim;
    }

    public void setAim(String aim) {
        this.aim = aim;
    }

    @Basic
    @Column(name = "further_information")
    public String getFurtherInformation() {
        return furtherInformation;
    }

    public void setFurtherInformation(String furtherInformation) {
        this.furtherInformation = furtherInformation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ActorEntity that = (ActorEntity) o;

        if (id != that.id) return false;
        if (actor != null ? !actor.equals(that.actor) : that.actor != null) return false;
        if (actorType != null ? !actorType.equals(that.actorType) : that.actorType != null) return false;
        if (topologicalAllocation != null ? !topologicalAllocation.equals(that.topologicalAllocation) : that.topologicalAllocation != null)
            return false;
        if (aim != null ? !aim.equals(that.aim) : that.aim != null) return false;
        if (furtherInformation != null ? !furtherInformation.equals(that.furtherInformation) : that.furtherInformation != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (actor != null ? actor.hashCode() : 0);
        result = 31 * result + (actorType != null ? actorType.hashCode() : 0);
        result = 31 * result + (topologicalAllocation != null ? topologicalAllocation.hashCode() : 0);
        result = 31 * result + (aim != null ? aim.hashCode() : 0);
        result = 31 * result + (furtherInformation != null ? furtherInformation.hashCode() : 0);
        return result;
    }
}
