/** 
 * Copyright (C) 2015  Nicolas Hernandez
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package fr.univnantes.lina.mlnlp.process.comparison;

import java.util.Set;


/**
 * @author hernandez
 *
 */
public abstract class SimilarityMeasures<T>  {

	/**
	 * Compute the similarity score between two terms
	 * 
	 * @param term1
	 * @param term2
	 * @return
	 */
	public Double measureTermTermSimilarity(T term1, T term2) {
		return null;
	}

	/**
	 * Compute the similarity score between a term and a set
	 * 
	 * @param term
	 * @param set
	 * @return
	 */
	public Double measureTermSetSimilarity (T term, Set<T> set){
		return null;
	}
	
	/**
	 * Compute the similarity score between two sets
	 * 
	 * @param set1
	 * @param set2
	 * @return
	 */
	public Double measureSetSetSimilarity (Set<T> set1, Set<T> set2){
		return null;
	}
	
}
