/*
 * Java Genetic Algorithm Library (@__identifier__@).
 * Copyright (c) @__year__@ Franz Wilhelmstötter
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Author:
 *    Franz Wilhelmstötter (franz.wilhelmstoetter@gmx.at)
 */
package org.jenetix;

import java.util.Random;

import org.jenetics.Chromosome;
import org.jenetics.util.ISeq;
import org.jenetics.util.RandomRegistry;

/**
 * @author <a href="mailto:franz.wilhelmstoetter@gmx.at">Franz Wilhelmstötter</a>
 */
final class TestTreeChromosome extends AbstractTreeChromosome<Integer, TestTreeGene> {

	public TestTreeChromosome(final ISeq<? extends TestTreeGene> genes) {
		super(genes);
	}

	@Override
	public Chromosome<TestTreeGene> newInstance() {
		final Random random = RandomRegistry.getRandom();

		return newInstance(
			_genes.map(g -> g.newInstance(random.nextInt(10000)))
		);
	}

	@Override
	public Chromosome<TestTreeGene> newInstance(final ISeq<TestTreeGene> genes) {
		return new TestTreeChromosome(genes);
	}
}
