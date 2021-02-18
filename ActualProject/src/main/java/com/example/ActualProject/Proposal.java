package com.example.ActualProject;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity @Table(name = "proposals")
public class Proposal {
    @Id
    @GeneratedValue
    @Column(name = "id")
    @Getter
    @Setter
    Long id;

    @Column(name = "proposal_name")
    @Getter
    @Setter
    String proposalName;

    @Column(name = "company_name")
    @Getter
    @Setter
    String companyName;

    @Column(name = "company_contant_name")
    @Getter
    @Setter
    String companyContactName;

    @Column(name = "company_contact_email")
    @Getter
    @Setter
    String companyContactEmail;

    @Column(name = "company_overview")
    @Getter
    @Setter
    String companyOverview;

    @Column(name = "contact_job_title")
    @Getter
    @Setter
    String contactJobTitle;

    @Column(name = "contact_phone")
    @Getter
    @Setter
    String contactPhone;

    @Column(name = "short_abstract")
    @Getter
    @Setter
    String shortAbstract;

    @Column(name = "long_Abstract")
    @Getter
    @Setter
    String longAbstract;

    @Column(name = "challenges")
    @Getter
    @Setter
    String challenges;

    @Column(name = "expertise_requested")
    @Getter
    @Setter
    String ExpertiseRequested;

    @Column(name = "devices_needed")
    @Getter
    @Setter
    List<String> devicesNeeded;

    @Column(name = "ixn_level_sdi")
    @Getter
    @Setter
    String IXNLevelSDI;

    @Column(name = "course_requested")
    @Getter
    @Setter
    String course_Requested;

    @Column(name = "open_source_status")
    @Getter
    @Setter
    String openSourceStatus;

    @Column(name = "ready_date")
    @Getter
    @Setter
    String readyDate;

    @Column(name = "review_status_code")
    @Getter
    @Setter
    Integer reviewStatusCode;

    @Column(name = "primary_codes")
    @Getter
    @Setter
    Integer primaryCodes;

    @Column(name = "searchable_keyword")
    @Getter
    @Setter
    String searchableKeyword;

   /* @Column(name = "ixn_form")
    @Getter
    @Setter
    boolean ixnForm;

    @Column(name = "ethics_form")
    @Getter
    @Setter
    boolean ethicsForm;*/

    @Column(name = "proposal_status")
    @Getter
    @Setter
    // this is meant to be a key for the pre statues
    // i am unsure how to create
    String proposalStatus;

    @Column(name = "project_id")
    @Getter
    @Setter
    String projectID;
}
