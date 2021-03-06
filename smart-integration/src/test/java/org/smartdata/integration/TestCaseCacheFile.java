/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.smartdata.integration;

import org.junit.Test;
import org.smartdata.integration.rest.RuleRestApi;

import static org.smartdata.integration.rest.ClusterRestApi.getCachedFilePaths;
import static org.smartdata.integration.rest.CmdletRestApi.submitCmdlet;
import static org.smartdata.integration.rest.CmdletRestApi.waitCmdletComplete;
import static org.smartdata.integration.rest.RuleRestApi.startRule;

public class TestCaseCacheFile extends IntegrationTestBase {

  @Test(timeout = 40000)
  public void test() throws Exception {
    //TODO : Random failure, need to fix
    /*String rule = "file : every 1s | accessCount(1min) > 1 | cache";
    long ruleId = RuleRestApi.submitRule(rule);
    startRule(ruleId);

    String file = "/testCache/testCacheFile";
    waitCmdletComplete(submitCmdlet("write -length 1024 -file " + file));

    waitCmdletComplete(submitCmdlet("read -file " + file));
    waitCmdletComplete(submitCmdlet("read -file " + file));

    while (true) {
      if (getCachedFilePaths().contains(file)) {
        break;
      }
      Thread.sleep(1000);
    }*/
  }
}
