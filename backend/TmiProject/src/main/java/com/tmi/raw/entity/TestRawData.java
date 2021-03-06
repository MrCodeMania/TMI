package com.tmi.raw.entity;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Document(collection = "test")
public class TestRawData {
	@Id
	ObjectId id;
	
	String buildTime;
	String packageName;
	String packageShortName;
	String gitUrl;
	String projectName;
	int runCount;
    int failCount;
    int errorCount;
    int skipCount;
    int elapsedTime;
    List<TestCase> testCaseList;
}