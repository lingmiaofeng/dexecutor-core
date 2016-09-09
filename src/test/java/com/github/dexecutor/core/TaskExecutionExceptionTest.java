/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.dexecutor.core;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

import com.github.dexecutor.core.task.TaskExecutionException;

public class TaskExecutionExceptionTest {

	@Test
	public void testMsgShouldBeAsPassed() {
		String msg = "MSG";
		TaskExecutionException ex = new TaskExecutionException(msg);
		assertThat(ex.getMessage(), equalTo(msg));
	}
	
	@Test
	public void testCauseShouldNotBeNull() {
		String msg = "MSG";
		TaskExecutionException ex = new TaskExecutionException(msg, new RuntimeException());
		assertNotNull(ex.getCause());
	}
}
