/**
 * Copyright (c) 2011 by InfoArmy Inc.  All Rights Reserved.
 * This file contains proprietary information of InfoArmy Inc.
 * Copying, use, reverse engineering, modification or reproduction of
 * this file without prior written approval is prohibited.
 *
 */
package com.wooplr.persistence.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.mongodb.MongoException;
import com.wooplr.persistence.common.BaseMongoDAO;
import com.wooplr.persistence.entity.Event;

/**
 * @author subharthi chatterjee
 * 
 */
public interface EventDAO extends BaseMongoDAO<Event, String> {

	String COLLECTION_NAME = "event";
	String TYPE = "type";
	String VALUE1 = "value1";
	String VALUE2 = "value2";

	List<Event> getEvent(String lastEventId, int limit) throws MongoException;

	List<Event> getEvent(String lastEventId, int limit, Date greaterThanDate) throws MongoException;

	Map<Integer, Integer> countEvents(Date greaterThanDate) throws MongoException;
}