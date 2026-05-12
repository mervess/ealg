# Efficient Algorithms (EALG)

<p align="center">
	<img src="img/ealg_logo_seedling_alt.svg" alt="EALG logo" width="680" />
</p>

Materials for the **Efficient Algorithms (EALG)** course in the FHNW Data Science BSc program.
This repository contains lecture notebooks, exercises, reference solutions, and profiling labs used during the course.

## Goals

- Build a practical understanding of core algorithms and data structures.
- Compare algorithmic approaches using runtime and memory profiling.
- Practice implementing and analyzing solutions in `Python`.

## Repository Structure

```text
ealg/
├── algorithms/
│   ├── dp.ipynb
│   ├── graphs.ipynb
│   ├── sorting_algorithms.ipynb
│   ├── sorting_exercise.ipynb
│   └── sorting_exercise_key.ipynb
├── data_structures/
│   ├── arrays_and_lists.ipynb
│   ├── stack_and_queue.ipynb
│   ├── stack_and_queue-key.ipynb
│   ├── tree_and_dictionary.ipynb
│   └── StackAndQueue.java
├── profiling/
│   ├── time_and_memory_complexity.ipynb
│   ├── profiling_time.ipynb
│   ├── profiling_memory.ipynb
│   ├── profiling_exercise.ipynb
│   ├── profiling_exercise_key.ipynb
│   ├── storage_exercise.ipynb
│   ├── storage_exercise_key.ipynb
│   └── storage_lab_data/
├── img/
├── requirements.txt
└── README.md
```

## Course Content Overview

All sections include exercises + _key_ notebooks for self-checking.

### 1) Algorithms (`algorithms/`)

- Sorting concepts and implementations
- Graph fundamentals and traversal ideas
- Dynamic programming (DP) principles

### 2) Data Structures (`data_structures/`)

- Arrays and lists
- Stacks and queues
- Trees and dictionary-like structures
- One Java example (`StackAndQueue.java`) for cross-language perspective

### 3) Profiling (`profiling/`)

- Time complexity experiments
- Memory usage analysis
- Storage-related practical labs

## Requirements

Main Python dependencies are pinned in `requirements.txt`, including:

- `numpy`, `pandas`, `matplotlib`, `seaborn`
- `networkx`
- `scikit_learn`
- `tensorflow`, `torch`
- `psutil`, `Pympler`
- `ipython`, `ipywidgets`, `rich`

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

## Instructor / Maintainer

- **Instructor:** Merve Selcuk Simsek
- **Program:** FHNW Data Science BSc
- **Role:** Course Instructor and Repository Maintainer

## License

This repository uses **dual licensing**:

- **Code** is licensed under the MIT License (see `LICENSE`).
- **Course content** (notebooks, exercise text, solutions, images, and explanatory material) is licensed under
	CC BY-NC-SA 4.0 (see `LICENSE-CONTENT`).

## Usage

This repository is intended for teaching and learning in the EALG context.
Please follow the terms in `LICENSE` and `LICENSE-CONTENT` when reusing material.
