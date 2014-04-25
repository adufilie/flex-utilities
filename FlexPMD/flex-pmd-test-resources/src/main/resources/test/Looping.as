////////////////////////////////////////////////////////////////////////////////
//
//  Licensed to the Apache Software Foundation (ASF) under one or more
//  contributor license agreements.  See the NOTICE file distributed with
//  this work for additional information regarding copyright ownership.
//  The ASF licenses this file to You under the Apache License, Version 2.0
//  (the "License"); you may not use this file except in compliance with
//  the License.  You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
//  Unless required by applicable law or agreed to in writing, software
//  distributed under the License is distributed on an "AS IS" BASIS,
//  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  See the License for the specific language governing permissions and
//  limitations under the License.
//
////////////////////////////////////////////////////////////////////////////////
package
{
   import com.model.VO.ConfigVO;
   
   import de.polygonal.ds.HashMap;

   public class Looping
   {
      public function Looping()
      {
         for ( var i : int = 0; i < 10; i++ )
         {
            new Foo();
            while( true )
            {
               new Object();
            }
            for each ( var i : Object in list )
            {
               new Object();
            }
         }
         new Object();
         for each ( var i : Object in list )
         {
            new Foo();
            while( true )
            {
               new Object();
            }
            for each ( var i : Object in list )
            {
               var o : Object = new Object();
            }
         }
         while( true )
         {
            new Foo();
            while( true )
            {
               new Object();
            }
            for each ( var i : Object in list )
            {
               new Object();
            }
         }
      }
   }
}