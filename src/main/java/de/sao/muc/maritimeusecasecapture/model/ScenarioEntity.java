package de.sao.muc.maritimeusecasecapture.model;

import javax.persistence.*;

@Entity
@Table(name = "scenario", schema = "use_case_db", catalog = "")
public class ScenarioEntity {
    private int id;
    private String name;
    private String precondition;
    private String postcondition;
    private int actuatorId;
    private int primaryActorId;

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
    @Column(name = "precondition")
    public String getPrecondition() {
        return precondition;
    }

    public void setPrecondition(String precondition) {
        this.precondition = precondition;
    }

    @Basic
    @Column(name = "postcondition")
    public String getPostcondition() {
        return postcondition;
    }

    public void setPostcondition(String postcondition) {
        this.postcondition = postcondition;
    }

    @Basic
    @Column(name = "actuator_id")
    public int getActuatorId() {
        return actuatorId;
    }

    public void setActuatorId(int actuatorId) {
        this.actuatorId = actuatorId;
    }

    @Basic
    @Column(name = "primary_actor_id")
    public int getPrimaryActorId() {
        return primaryActorId;
    }

    public void setPrimaryActorId(int primaryActorId) {
        this.primaryActorId = primaryActorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ScenarioEntity that = (ScenarioEntity) o;

        if (id != that.id) return false;
        if (actuatorId != that.actuatorId) return false;
        if (primaryActorId != that.primaryActorId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (precondition != null ? !precondition.equals(that.precondition) : that.precondition != null) return false;
        if (postcondition != null ? !postcondition.equals(that.postcondition) : that.postcondition != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (precondition != null ? precondition.hashCode() : 0);
        result = 31 * result + (postcondition != null ? postcondition.hashCode() : 0);
        result = 31 * result + actuatorId;
        result = 31 * result + primaryActorId;
        return result;
    }
}
