/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package smoketest.websocket.jetty.client;

public class SimpleGreetingService implements GreetingService {

    private static final List<String> GREETINGS = Arrays.asList(
        "Hello world!",
        "Welcome to Spring Boot!",
        "Hi there!",
        "Greetings from the SimpleGreetingService!",
        "Have a great day!"
    );

    private final Random random = new Random();

    @Override
    public String getGreeting() {
        // Return a random greeting from the list
        return GREETINGS.get(random.nextInt(GREETINGS.size()));
    }
}