/*
 * JBoss, Home of Professional Open Source
 * Copyright 2010, Red Hat, Inc., and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.jsr299.tck.tests.jbt.lookup;

import static org.jboss.jsr299.tck.tests.jbt.lookup.PayBy.PaymentMethod.CHEQUE;

import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.inject.Provider;

class ObtainsInstanceBean {
   @Inject @PayBy(CHEQUE) Instance<AsynchronousPaymentProcessor> paymentProcessor;
   @Inject @PayBy(CHEQUE) Provider<AsynchronousPaymentProcessor> paymentProcessor2;

   @Inject @Any Instance<PaymentProcessor> anyPaymentProcessor;
   @Inject @Any Provider<PaymentProcessor> anyPaymentProcessor2;

   @Inject @Any PaymentProcessor anyPaymentProcessorBroken;

   @Inject PaymentProcessor defaultPaymentProcessor;

   public Instance<AsynchronousPaymentProcessor> getPaymentProcessor() {
      return paymentProcessor;
   }

   public Instance<PaymentProcessor> getAnyPaymentProcessor() {
      return anyPaymentProcessor;
   }
}