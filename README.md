# Efficient Algorithms (EALG)

<p align="center">
	<img src="img/ealg_logo_seedling_alt.svg" alt="EALG logo" width="680" />
</p>

<small><i>Logo generated with GitHub Copilot.</i></small>

Materials for the **Efficient Algorithms (EALG)** course in the FHNW Data Science BSc program.
This repository contains lecture notebooks, exercises, reference solutions, and profiling labs used during the course.

## Goals

<p align="center">
	<img src="img/ealg_poster.png" alt="EALG poster" width="600" />
</p>

<small><i>Poster generated with ChatGPT, OpenAI.</i></small>

- Build a practical understanding of core algorithms and data structures.
- Compare algorithmic approaches using runtime and memory profiling.
- Practice implementing and analyzing solutions in `Python`.

## Repository Structure

```text
ealg/
├── algorithms/
├── data_structures/
│   ├── README.md
|	├── StackAndMap.java
|	├── arrays_and_lists.ipynb
|	├── queue_and_tree.ipynb
|	├── requirements.txt
|	├── stack_and_dict_exercise.ipynb
|	└── stack_and_dictionary.ipynb
├── profiling/
├── img/
├── requirements.txt
└── README.md
```

## Course Content Overview

All sections include exercises + _key_ notebooks for self-checking.

### 1) Algorithms (`algorithms/`)

### 2) Data Structures (`data_structures/`)

- Arrays and lists
- Stacks and dictionary-like structures
- Trees and queues
- One Java example (`StackAndMap.java`) for cross-language perspective

### 3) Profiling (`profiling/`)

## Requirements

Each module contains its own `requirements.txt` with the dependencies needed to run that module. The root `requirements.txt` includes the combined dependencies for all course materials.

## Setup

### 1) Create and activate a virtual environment

```bash
python3 -m venv env_ealg
source env_ealg/bin/activate
```

### 2) Install dependencies

```bash
pip install -r requirements.txt
```

### 3) Start Jupyter

```bash
jupyter lab
```

Then open the notebooks from `algorithms/`, `data_structures/`, or `profiling/`.

## Working Pattern (Recommended)

- Use notebooks **without** `_key` first.
- Solve tasks independently.
- Use matching `_key` notebooks to compare and review your approach.

## Naming Convention

- `*_exercise.ipynb`: student version
- `*_exercise_key.ipynb` or `*-key.ipynb`: reference solution

## Notes

- Some notebooks are computation-heavy due to ML/profiling examples.
- If a notebook feels slow, restart the kernel and run cells step by step.

## Licensing and Attribution

Generative AI tools were used selectively for language editing, brainstorming, code support, and image generation. Images generated with AI are indicated. External sources are referenced in the corresponding materials.

This repository uses separate licenses for code and educational content.

Code, including source files and code contained in notebooks, is licensed under the MIT License. See `LICENSE`.

Educational content, including explanatory text, exercises, solutions, figures, and other teaching materials, is licensed under CC BY NC SA 4.0. See `LICENSE-CONTENT`.
