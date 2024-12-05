package org.techm.codingchallenges.entity;
import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
 
@Entity
@Table( name = "teams")
public class Teams {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    @NotNull
    private Integer teamId;
   
    @Column
    @NotNull
    private String teamName;
   
    @Column
    @NotNull
    private Integer runs;
   
    @Column
    @NotNull
    private Integer targetRuns;
   
    @Column
    @NotNull
    private Integer year;
   
   
    public Teams(String teamName, Integer runs, Integer targetRuns, Integer year) {
        super();
        this.teamName = teamName;
        this.runs = runs;
        this.targetRuns = targetRuns;
        this.year = year;
    }
 
    public Teams() {
    }
 
    public Integer getTeamId() {
        return teamId;
    }
 
    public void setTeamId(Integer teamId) {
        this.teamId = teamId;
    }
 
    public String getTeamName() {
        return teamName;
    }
 
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
 
    public Integer getRuns() {
        return runs;
    }
 
    public void setRuns(Integer runs) {
        this.runs = runs;
    }
 
    public Integer getTargetRuns() {
        return targetRuns;
    }
 
    public void setTargetRuns(Integer targetRuns) {
        this.targetRuns = targetRuns;
    }
 
    public Integer getYear() {
        return year;
    }
 
    public void setYear(Integer year) {
        this.year = year;
    }
 
    @Override
    public String toString() {
        return "Teams [teamId=" + teamId + ", teamName=" + teamName + ", runs=" + runs + ", targetRuns=" + targetRuns
                + ", year=" + year + "]";
    }
   
}