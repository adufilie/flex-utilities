/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.adobe.ac.pmd.rules.unused;

import com.adobe.ac.pmd.rules.core.AbstractAstFlexRuleTest;
import com.adobe.ac.pmd.rules.core.AbstractFlexRule;
import com.adobe.ac.pmd.rules.core.ViolationPosition;

public class EmptyPrivateMethodRuleTest extends AbstractAstFlexRuleTest
{
   @Override
   protected ExpectedViolation[] getExpectedViolatingFiles()
   {
      return new ExpectedViolation[]
      { new ExpectedViolation( "bug.FlexPMD97.as", new ViolationPosition[]
       { new ViolationPosition( 39 ) } ),
                  new ExpectedViolation( "Sorted.as", new ViolationPosition[]
                  { new ViolationPosition( 62 ),
                              new ViolationPosition( 71 ) } ),
                  new ExpectedViolation( "com.adobe.ac.ncss.BigModel.as", new ViolationPosition[]
                  { new ViolationPosition( 82 ),
                              new ViolationPosition( 86 ),
                              new ViolationPosition( 90 ),
                              new ViolationPosition( 94 ),
                              new ViolationPosition( 98 ) } ),
                  new ExpectedViolation( "cairngorm.events.CorrectConstantEvent.as", new ViolationPosition[]
                  { new ViolationPosition( 53 ) } ) };
   }

   @Override
   protected AbstractFlexRule getRule()
   {
      return new EmptyPrivateMethodRule();
   }
}
